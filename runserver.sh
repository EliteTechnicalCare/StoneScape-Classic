#!/bin/bash
echo "StoneScape v1 BETA"

# Get the directory of the script
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"

# Change to the bin directory
cd "$SCRIPT_DIR/bin" || { echo "Directory not found: $SCRIPT_DIR/bin"; exit 1; }

# Run the Java Server with the package name
java core.Server

echo "Press any key to exit."
read -n 1 -s