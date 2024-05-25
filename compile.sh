@ -0,0 +1,31 @@
#!/bin/bash

# Function to compile the Java files
compile_java_files() {
    echo "Compiling..."

    # Get the directory of the script
    SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"

    # Find and compile all .java files within the Source directory and its subdirectories
    find "$SCRIPT_DIR/Source" -name "*.java" | xargs javac -d "$SCRIPT_DIR/Bin/"

    echo "Compilation complete."
}

# Initial compilation
compile_java_files

# Loop to ask if the user wants to recompile
while true; do
    echo "Press 'r' to recompile or any other key to exit."
    read -n 1 -s input

    if [ "$input" = "r" ]; then
        compile_java_files
    else
        break
    fi
done

echo "Exiting..."