/usr/local/mysql-5.7.22-macos10.13-x86_64/bin/mysqladmin --host=localhost --user=$2 --password=$3 drop $1 -f
/usr/local/mysql-5.7.22-macos10.13-x86_64/bin/mysqladmin --host=localhost --user=$2 --password=$3 create $1 -f
/usr/local/mysql-5.7.22-macos10.13-x86_64/bin/mysql --host=localhost --user=$2 --password=$3 --database=$1 < ebus.sql
