{ pkgs ? import <nixpkgs> {} }:

pkgs.stdenv.mkDerivation {
  name = "python-program-runner";
  buildInputs = [
    pkgs.python
  ];

  shellHook = ''
    python math4.py
  '';
}
