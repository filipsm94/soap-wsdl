const myHeaders = new Headers();
myHeaders.append("Content-Type", "text/xml");
const parser = new DOMParser();

function getPets() {

    var raw = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n	<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:com=\"http://com.co/\">\r\n	   <soapenv:Header/>\r\n	   <soapenv:Body>\r\n	      <com:getPet/>\r\n	   </soapenv:Body>\r\n	</soapenv:Envelope>";

    var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/SOAPWS/PetsWs", requestOptions)
        .then(response => response.text())
        .then(result => {
            const xml = parser.parseFromString(result, "text/xml");
            const jsonObject = xmlToJson(xml);
            const arreglo = jsonObject['S:Envelope']['S:Body']['ns2:getPetResponse'].return;
            let data = `
                <table class="table table-striped">
                <thead>
                    <tr>
                    <th scope="col">Codigo</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Tipo</th>
                    <th scope="col">Genero</th>
                    </tr>
                </thead>
                <tbody>`;
            arreglo.forEach(element => {
                data += `
                <tr>
                    <th scope="row">${element.code['#text']}</th>
                    <td>${element.name['#text']}</td>
                    <td>${element.type['#text']}</td>
                    <td>${element.gender['#text']} </td>
                </tr>`;
            });
            data += ` </tbody></table>`;
            paintData(data);
        })
        .catch(error => console.log('error', error));

}

function getUsers() {

    var raw = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:com=\"http://com.co/\">\r\n   <soapenv:Header/>\r\n   <soapenv:Body>\r\n      <com:getUsers/>\r\n   </soapenv:Body>\r\n</soapenv:Envelope>";

    var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/SOAPWS/UserWs", requestOptions)
        .then(response => response.text())
        .then(result => {
            const xml = parser.parseFromString(result, "text/xml");
            const jsonObject = xmlToJson(xml);
            const arreglo = jsonObject['S:Envelope']['S:Body']['ns2:getUsersResponse'].return;
            console.log(arreglo);
            let data = `
                <table class="table table-striped">
                <thead>
                    <tr>
                    <th scope="col">Codigo</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Direccion</th>
                    <th scope="col">Telefono</th>
                    </tr>
                </thead>
                <tbody>`;
            arreglo.forEach(element => {
                data += `
                <tr>
                    <th scope="row">${element.code['#text']}</th>
                    <td>${element.firstName['#text']} ${element.lastName['#text']}</td>
                    <td>${element.direction['#text']}</td>
                    <td>${element.mobile['#text']} </td>
                </tr>`;
            });
            data += ` </tbody></table>`;
            paintData(data);
        })
        .catch(error => console.log('error', error));
}

function xmlToJson(xml) {

    // Create the return object
    var obj = {};

    if (xml.nodeType == 1) { // element
        // do attributes
        if (xml.attributes.length > 0) {
            obj["@attributes"] = {};
            for (var j = 0; j < xml.attributes.length; j++) {
                var attribute = xml.attributes.item(j);
                obj["@attributes"][attribute.nodeName] = attribute.nodeValue;
            }
        }
    } else if (xml.nodeType == 3) { // text
        obj = xml.nodeValue;
    }

    // do children
    if (xml.hasChildNodes()) {
        for (var i = 0; i < xml.childNodes.length; i++) {
            var item = xml.childNodes.item(i);
            var nodeName = item.nodeName;
            if (typeof (obj[nodeName]) == "undefined") {
                obj[nodeName] = xmlToJson(item);
            } else {
                if (typeof (obj[nodeName].push) == "undefined") {
                    var old = obj[nodeName];
                    obj[nodeName] = [];
                    obj[nodeName].push(old);
                }
                obj[nodeName].push(xmlToJson(item));
            }
        }
    }
    return obj;
};

function paintData(text) {
    const resultado = document.getElementById('result');
    resultado.innerHTML = text
}