#!/bin/bash
echo "StoneScape v1 BETA"

# Function to start the Java server
start_server() {
    # Get the directory of the script
    SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"

    # Change to the bin directory
    cd "$SCRIPT_DIR/bin" || { echo "Directory not found: $SCRIPT_DIR/bin"; exit 1; }

    # Run the Java Server with the package name
    java core.Server
}

# Initial server start
start_server

# Loop to check for 'r' to restart the server
while true; do
    echo "Press 'r' to restart the server or any other key to exit."
    read -n 1 -s input

    if [ "$input" = "r" ]; then
        start_server
    else
        break
    fi
done

echo "Exiting..."