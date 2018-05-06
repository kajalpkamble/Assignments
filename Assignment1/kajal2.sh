#!/bin/bash
echo folder name
read folder
echo enter number
read number
mkdir $folder
cd $folder

for((i=1;i<=$number;i++))
  do
    touch $folder$i
  done

  zip -r $folder.zip *

 len=${#folder}

  for((i=$len-1;i>=0;i--))
  do
     revfolder="$revfolder${folder:$i:1}"
  done

mkdir $revfolder

unzip $folder.zip -d $revfolder/$folder

for((i=1; i<=$number; i++))
  do
    mv  $folder$i $revfolder
  done

  cd $revfolder
  path="$PWD"
  rm -rf $folder
  #echo "$path"
  cd /

  sudo adduser devops

  sudo chown -R devops:devops $path
  sudo chmod -R 755 $path
  cd "$path"
  ls
