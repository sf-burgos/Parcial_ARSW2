var map;
var m;

function initMap(puntos)
{
    map = new google.maps.Map(document.getElementById('map'), {
        center: {lat: -34.397, lng: 150.644},
        zoom: 8
    });

    fetch('https://raw.githubusercontent.com/jayshields/google-maps-api-template/master/markers.json')
        .then(function(response){return response.json()})
        .then(plotMarkers);
    m= puntos;


}

var markers;
var bounds;

function plotMarkers()
{
    markers = [];
    bounds = new google.maps.LatLngBounds();

    m.forEach(function (marker) {
        var position = new google.maps.LatLng(marker.coord.lat, marker.coord.lon);
        markers.push(
            new google.maps.Marker({
                position: position,
                map: map,
                animation: google.maps.Animation.DROP
            })
        );

        bounds.extend(position);
    });

    map.fitBounds(bounds);
}