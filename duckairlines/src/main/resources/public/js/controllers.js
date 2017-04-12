angular.module('app.controllers', []).controller('AircraftsListController', function($scope, $state, popupService, $window, Aircrafts) {

	$scope.aircrafts = Aircrafts.query(); //fetch all Aircrafts. Issues a GET to /api/v1/aircrafts

  $scope.deleteAircrafts = function(aircraft) { // Delete a Aircrafts. Issues a DELETE to /api/v1/aircrafts/:id
	 // console.log(aircraft);
	  if (popupService.showPopup('Really delete this?')) {
    	aircraft.$delete(function() {
    	$scope.aircrafts = Aircrafts.query(); 
        $state.go('aircrafts');
      });
    }
  };
}).controller('AircraftsViewController', function($scope, $stateParams, Aircrafts) {
  $scope.aircrafts = Aircrafts.get({ id: $stateParams.id }); //Get a single Aircrafts.Issues a GET to /api/v1/aircrafts/:id
}).controller('AircraftsCreateController', function($scope, $state, $stateParams, Aircrafts) {
  $scope.aircrafts = new Aircrafts();  //create new Aircrafts instance. Properties will be set via ng-model on UI
  $scope.addAircrafts = function() { //create a new Aircrafts. Issues a POST to /api/v1/aircrafts
 	 console.log($scope.aircrafts);
	  $scope.aircrafts.$save(function() {
    $state.go('aircrafts'); // on success go back to the list i.e. Aircrafts state.
    });
  };
}).controller('AircraftsEditController', function($scope, $state, $stateParams, Aircrafts) {
  $scope.updateAircrafts = function() { //Update the edited Aircrafts. Issues a PUT to /api/v1/aircrafts/:id
    $scope.aircrafts.$update(function() {
      $state.go('aircrafts'); // on success go back to the list i.e. Aircrafts state.
    });
  };

  $scope.loadAircrafts = function() { //Issues a GET request to /api/v1/Aircrafts/:id to get a aircrafts to update
    $scope.aircrafts = Aircrafts.get({ id: $stateParams.id });
  };

  $scope.loadAircrafts(); // Load a Aircrafts which can be edited on UI

});
