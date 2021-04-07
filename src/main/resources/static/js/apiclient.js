api = (function () {

    return {
        getDatos: function(ciudad, callback) {
            var promise = $.getJSON(`/clima/${ ciudad }`);
            $.when (promise).done(function (data) {
                callback(data, ciudad);
            });
        }
    }

    
})();