/**
 * Created by sutaiyun on 2017/3/30.
 */
(function () {
  'use strict';

  angular.module('BlurAdmin.pages.dashboard', [])
      .config(routeConfig);

  /** @ngInject */
  function routeConfig($stateProvider) {
    $stateProvider
        .state('dashboard', {
          url: '/dashboard',
          templateUrl: 'app/pages/dashboard/dashboard-demo.html',
          title: 'Dashboard',
          sidebarMeta: {
            icon: 'ion-android-home',
            order: 0,
          },
        });
  }

})();
