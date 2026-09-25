default: inst-dist run-dist

run-dist:
	./build/install/app/bin/app
	
inst-dist:
	./gradlew clean
	./gradlew installDist

linter-check:
	./gradlew spotlessCheck

linter-apply:
	./gradlew spotlessApply