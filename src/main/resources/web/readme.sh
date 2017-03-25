#0,
#       http://localhost:8081/dist/index.html
#       http://localhost:8081/index.html

#1, blur-admin
cd ../../../blur-admin
npm install
gulp build
cp -rf release ../src/main/resources/web

#2, kity-minder-editor
cd ../web/kityminder-editor
npm run init

cd ../..
cp -rf web/kityminder-editor/bower_components  ../src/main/resources/web
cp -rf web/kityminder-editor/dist              ../src/main/resources/web
cp -rf web/kityminder-editor/less              ../src/main/resources/web
cp -rf web/kityminder-editor/server            ../src/main/resources/web
cp -rf web/kityminder-editor/ui                ../src/main/resources/web

#3, ���ܺϲ� web_dev�µ���Դ�� webĿ¼
    ������ web_dev�µ���Դ�滻 blur-admin ���� kity-minder-editor�µ���Դ�� �����ֱ�Ӹ��� webĿ¼��
