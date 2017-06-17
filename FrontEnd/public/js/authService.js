app.factory('RegistrationService', function ($http, $q, $location) {
    var fac = {};
    fac.SaveFormData = function (register) {
        var defer = $q.defer();
        $http({
            url: 'http://localhost:8080/AppRestServices/adduser',
            method: 'POST',
            data: register,
            headers: { 'content-type': 'application/json' }
			
        });
        return defer.promise;
		console.log(register);
    }
    return fac;
});
