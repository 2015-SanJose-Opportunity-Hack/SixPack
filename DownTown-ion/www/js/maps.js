/**
 * Created by omkargudekar on 10/3/15.
 */
function getCurrentLocation() {
    try {
        navigator.geolocation.getCurrentPosition(function (position) {
            reverseGeoCode(position.coords.latitude, position.coords.longitude)

        }, function () {
            console.log('Navigator Not Supported by browser')

        });

    }
    catch (error) {

        console.log(error.message);
    }

}


function reverseGeoCode(lat, lon) {
    try {
        var xhr = new XMLHttpRequest();
        xhr.open('GET', 'https://maps.googleapis.com/maps/api/geocode/json?latlng='+ lat + ',' +lon);
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4 && xhr.status == 200) {
                localStorage.setItem('latitude', lat);
                localStorage.setItem('longitude', lon);
                var result = JSON.parse(xhr.responseText);
                var address = result.results[0].formatted_address;
                localStorage.setItem('address', address);
            }
        }
        xhr.send();

    }
    catch (err) {
        console.log(err.message);
    }
}




