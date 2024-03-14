import subprocess

def run_java_program():
    try:
        print("Trying to run the Java program...")
        subprocess.run(["javac", "math4.java"])
        subprocess.run(["java", "Main"])
    except subprocess.CalledProcessError:
        print("Error running Java program.")

if __name__ == "__main__":
    run_java_program()import subprocess

def run_python_script():
    try:
        print("Trying to run the Python script...")
        subprocess.run(["python", "math4.py"], check=True)
    except subprocess.CalledProcessError:
        print("Error running Python script. Trying to run the Java program as a backup...")
        subprocess.run(["javac", "math4.java"])
        subprocess.run(["java", "Main"])

if __name__ == "__main__":
    run_python_script()
