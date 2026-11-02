#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"
javac *.java
echo "Compilation successful."
