{ pkgs ? import <nixpkgs> {} }:

pkgs.stdenv.mkDerivation {
  name = "java-program-runner";
  buildInputs = [
    pkgs.openjdk
  ];

  shellHook = ''
    javac math4.java
    java Main

    rm Main.class
  '';
}
