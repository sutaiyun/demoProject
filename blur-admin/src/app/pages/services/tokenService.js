(function () {
    'use strict';
    angular.module('BlurAdmin.pages')
        .service('tokenService', tokenService);

    function tokenService($http) {
        var tokenName = "DEMO-TOKEN";
        this.getToken = function () {
            var arr,reg=new RegExp("(^| )"+tokenName+"=([^;]*)(;|$)");
            if(arr=document.cookie.match(reg))
                return unescape(arr[2]);
            else
                return null;
        };
        this.setToken = function (token) {
            var Hours = 2;
            var exp = new Date();
            exp.setTime(exp.getTime() + Hours*60*60*1000);
            document.cookie = tokenName + "="+ escape (token) + ";expires=" + exp.toGMTString();
        };
        this.deleteToken = function () {
            var exp = new Date();
            exp.setTime(exp.getTime() - 1);
            var cval=this.getToken();
            if(cval!=null)
                document.cookie= tokenName + "="+cval+";expires="+exp.toGMTString();
        };
    }
})();