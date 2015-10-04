var server = 'http://192.168.84.239';
var port = ':9000';

function getServerURL() {
  return server + port;
}


function submitRequest(formdata) {


  var url = getServerURL() + '/request/v1';
  try {
    var xhr = new XMLHttpRequest();
    xhr.open('POST', url);
    xhr.onreadystatechange = function () {
      if (xhr.readyState == 4 && xhr.status == 200) {
        successCallback(xhr.responseText);
        window.location.href = "confirmation.html"
      }
    }
    xhr.send(formdata);
  }
  catch (err) {
    alert(err.message);
  }
}


function successCallback(responseText) {

  console.log(responseText);
}


function getFormData() {

  var formData = null;
  try {

    formData = new FormData();
    formData.append("firstName", localStorage.getItem('firstName') || '');
    formData.append("lastName", localStorage.getItem('lastName') || '');
    formData.append("email", localStorage.getItem('email') || '');
    formData.append("contact", localStorage.getItem('contact') || '');
    formData.append("business", localStorage.getItem('business') || '');
    try {
      setLatLongs();

    }
    catch (err) {
      alert(err);
    }
    formData.append("latitude", localStorage.getItem('latitude') || '');
    formData.append("longitude", localStorage.getItem('longitude') || '');
    formData.append("location", localStorage.getItem('location') || '');
    formData.append("comments", localStorage.getItem('comments') || '');
    var blob = dataURItoBlob(localStorage.getItem('image'));
    formData.append("image", blob, '1.jpg');

    submitRequest(formData);

  }
  catch (error) {

    alert(error.message)
  }
  return formData;
}


function dataURItoBlob(dataURI) {
  var byteString = atob(dataURI.split(',')[1]);
  var mimeString = dataURI.split(',')[0].split(':')[1].split(';')[0]
  var ab = new ArrayBuffer(byteString.length);
  var ia = new Uint8Array(ab);
  for (var i = 0; i < byteString.length; i++) {
    ia[i] = byteString.charCodeAt(i);
  }
  var bb = new Blob([ab], {type: mimeString});
  return bb;
}
