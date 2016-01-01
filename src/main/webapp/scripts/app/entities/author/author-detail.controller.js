'use strict';

angular.module('jhipsterApp')
    .controller('AuthorDetailController', function ($scope, $rootScope, $stateParams, entity, Author, Books) {
        $scope.author = entity;
        $scope.load = function (id) {
            Author.get({id: id}, function(result) {
                $scope.author = result;
            });
        };
        var unsubscribe = $rootScope.$on('jhipsterApp:authorUpdate', function(event, result) {
            $scope.author = result;
        });
        $scope.$on('$destroy', unsubscribe);

    });
