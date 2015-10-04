/**
 * Created by omkargudekar on 10/3/15.
 */
function getCurrentLocation() {
  try {
    navigator.geolocation.getCurrentPosition(function (position) {
      localStorage.setItem('latitude', position.coords.latitude);
      localStorage.setItem('longitude', position.coords.longitude);
      reverseGeoCode(position.coords.latitude, position.coords.longitude)
    }, function () {
      console.log('Navigator Not Supported by browser')
    });
  }
  catch (error) {
    console.log(error.message);
  }

}


function setLatLongs() {


  try {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'https://maps.googleapis.com/maps/api/geocode/json?address=' + address);
    xhr.onreadystatechange = function () {
      if (xhr.readyState == 4 && xhr.status == 200) {

        var result = JSON.parse(xhr.responseText);
        var lat = result.results[0].geometry.location.lat;
        var lng = result.results[0].geometry.location.lng;
        localStorage.setItem('latitude', lat);
        localStorage.setItem('longitude', lng);
      }
    }
    xhr.send();
  }
  catch (err) {
    console.log(err.message);
  }

}


function reverseGeoCode(lat, lon) {
  try {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'https://maps.googleapis.com/maps/api/geocode/json?latlng=' + lat + ',' + lon);
    xhr.onreadystatechange = function () {
      if (xhr.readyState == 4 && xhr.status == 200) {

        var result = JSON.parse(xhr.responseText);
        var address = result.results[0].formatted_address;
        localStorage.setItem('location', address);
      }
    }
    xhr.send();
  }
  catch (err) {
    console.log(err.message);
  }
}




