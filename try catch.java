    } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un valor entero. Intente nuevamente.");
                input.nextLine(); // descartar la entrada no válida para que no se convierta en un bucle infinito
                opcion = -1; // establecer opción en un valor inválido para repetir el bucle
            } finally {
                // limpiar el búfer del objeto Scanner
                input.nextLine();
