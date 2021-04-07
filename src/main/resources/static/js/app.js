app = (function (){

    function mostrarDatos(datos, ciudad){
        let jsondata =JSON.parse(JSON.stringify(datos));
        $("#ciudadname").html(ciudad);
        $("#infotable > tbody").empty()
        let fila  = `<tr>
                        <td class="text-center">
                            <div class="row m-3 p-2" style="border: 1px solid #000; border-radius: 5px;">
                                <label class="col-12"><strong>name: </strong>${jsondata.name}</label>
                                <label class="col-12"><strong>cod: </strong>${jsondata.cod}</label>
                                <label class="col-12"><strong>id: </strong>${jsondata.id}</label>
                                <label class="col-12"><strong>Visibility: </strong>${jsondata.visibility}</label>
                                <label class="col-12"><strong>Temp: </strong>${jsondata.main.temp}</label>
                                <label class="col-12"><strong>temp_min: </strong>${jsondata.main.temp_min}</label>
                                <label class="col-12"><strong>humidity: </strong>${jsondata.main.humidity}</label>
                                <label class="col-12"><strong>pressure: </strong>${jsondata.main.pressure}</label>
                                <label class="col-12"><strong>feels_like: </strong>${jsondata.main.feels_like}</label>
                                <label class="col-12"><strong>temp_max: </strong>${jsondata.main.temp_max}</label>
                                <label class="col-12"><strong>clouds - all: </strong>${jsondata.clouds.all}</label>
                                <label class="col-12"><strong>sys - country: </strong>${jsondata.sys.country}</label>
                                <label class="col-12"><strong>sys - sunrise: </strong>${jsondata.sys.sunrise}</label>
                                <label class="col-12"><strong>sys - sunset: </strong>${jsondata.sys.sunset}</label>
                                <label class="col-12"><strong>sys - id: </strong>${jsondata.sys.id}</label>
                                <label class="col-12"><strong>sys - type: </strong>${jsondata.sys.type}</label>}
                                <label class="col-12"><strong>dt: </strong>${jsondata.dt}</label>
                                <label class="col-12"><strong>coord - lon: </strong>${jsondata.coord.lon}</label>
                                <label class="col-12"><strong>coord - lat: </strong>${jsondata.coord.lat}</label>        
                                <label class="col-12"><strong>weather - icon: </strong>${jsondata.weather[0].icon}</label>
                                <label class="col-12"><strong>weather - description: </strong>${jsondata.weather[0].description}</label>
                                <label class="col-12"><strong>weather - main: </strong>${jsondata.weather[0].main}</label>
                                <label class="col-12"><strong>weather - id: </strong>${jsondata.weather[0].id}</label>
                            </div>
                        </td>
                    </tr>`
        $("#infotable > tbody").append(fila);
    }

    return{
        consultarClima: function (ciudad) {
            api.getDatos(ciudad, mostrarDatos);
        }
    }
})();

