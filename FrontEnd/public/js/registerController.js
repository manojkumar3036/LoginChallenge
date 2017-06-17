app.controller('registerController', function($scope, RegistrationService){
  $scope.SaveData = function () {
             $scope.submitted = true;
             $scope.message = '';
                 $scope.submitText = 'Please Wait...';
                 RegistrationService.SaveFormData($scope.register).then(function (response) {
                     alert(response);
                     if (response == 'Success') {
                         //have to clear form here
                         ClearForm();
                     }
                     $scope.submitText = "Save";
                 });


     }
});
