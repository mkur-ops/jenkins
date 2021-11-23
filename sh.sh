#!bin/bash
modules=$(cat ./modules.txt | grep -v "^#")
rhome=$(pwd)/repo
mkdir "$rhome"

for module in ${modules[*]} ; do
  echo 'module: '$module
  m='echo $module | rev | cut -d/ -f1 | rev'
  echo  $m
  location=$rhome/$m
  mkdir "$location"
  pushd "$rhome" > /dev/null 2>&1
done
echo 'modules: ' $modules
echo 'location: ' $location

module1="nfx/f/dev"
echo $module1 | rev | cut -d/ -f1 | rev
