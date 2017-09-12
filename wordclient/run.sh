#! /bin/bash
./gradlew -Dspring.application.name=SUBJECT bootrun &
./gradlew -Dspring.application.name=VERB bootrun &
./gradlew -Dspring.application.name=ARTICLE bootrun &
./gradlew -Dspring.application.name=ADJECTIVE bootrun &
./gradlew -Dspring.application.name=NOUN bootrun &

