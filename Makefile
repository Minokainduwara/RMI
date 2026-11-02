.PHONY: compile run-server run-client clean test

compile:
\tjavac *.java

run-server: compile
\tjava HelloServer

run-client: compile
\tjava HelloClient

test:
\t./test.sh

clean:
\trm -f *.class
