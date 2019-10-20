#!/usr/bin/env bash

cp ../target/opencsv-fitnesse*.jar ./lib/opencsv-fitnesse.jar

java -jar fitnesse-standalone.jar -p 10000

