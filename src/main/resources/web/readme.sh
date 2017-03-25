#0,
#       http://localhost:8081/dist/index.html
#       http://localhost:8081/index.html

#1, blur-admin
cd ../../../blur-admin
cp -rf release ../src/main/resources/web

#2, kity-minder-editor
cd ..
cp -rf web/kityminder-editor/bower_components  ../src/main/resources/web
cp -rf web/kityminder-editor/dist              ../src/main/resources/web
cp -rf web/kityminder-editor/less              ../src/main/resources/web
cp -rf web/kityminder-editor/server            ../src/main/resources/web
cp -rf web/kityminder-editor/ui                ../src/main/resources/web

#3, 可能合并 web_dev下的资源到 web目录
    （或者 web_dev下的资源替换 blur-admin 或者 kity-minder-editor下的资源， 编译后直接覆盖 web目录）
