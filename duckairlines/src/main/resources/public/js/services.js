angular.module('app.services', []).factory('Aircrafts', function($resource) {
  return $resource('/api/v1/aircrafts/:id', { id: '@aircraft_id' }, {
	 update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
