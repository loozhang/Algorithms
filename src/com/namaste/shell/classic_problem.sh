#!/usr/bin/env bash

#1、设计一个shell程序，在/userdata目录下建立50个目录，即user1~user50，并设置每个目录的权限，其中，其他用户的权限为：读；文件所有者的权限为：读、写、执行；文件所有者所在组的权限为：读、执行。
for(i=1;i<=50;i++);
do
mkdir ./userdata/user"$i"
chmod 754 ./userdata/user"$i"
done