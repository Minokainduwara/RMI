#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"

javac *.java

java HelloServer & SERVER_PID=$!
trap 'kill $SERVER_PID 2>/dev/null || true; wait $SERVER_PID 2>/dev/null || true' EXIT

sleep 2

OUTPUT=$(java HelloClient)
echo "$OUTPUT"

if [ "$OUTPUT" != "Hello, World!" ]; then
    echo "Unexpected output" >&2
    exit 1
fi

echo "Integration test passed."
