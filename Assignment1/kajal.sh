#!/bin/bash
# taking user’s input
echo folder name
read folder
mkdir $folder
cd $folder

for((i=0;i<4;i++))
  do
    touch $folder$i

  done
  zip -r $folder.zip *

 len=${#folder}
echo $len
  for((i=$len-1;i>=0;i--))
  do
    revfolder ="$revfolder${folder:$i:1}"
  done

mkdir $revfolder

unzip $folder.zip -d $revfolder/$folder
