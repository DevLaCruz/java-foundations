import os
import re

# Función para recorrer todos los archivos en un directorio y subdirectorios
def buscar_clases_java(directorio):
    # Expresión regular para encontrar las definiciones de clase en un archivo .java
    patron_clase = re.compile(r'class\s+([A-Za-z_][A-Za-z0-9_]*)\s*[{]')
    
    clases_encontradas = []

    # Recorremos todos los archivos en el directorio especificado
    for root, dirs, files in os.walk(directorio):
        for archivo in files:
            # Solo procesamos archivos .java
            if archivo.endswith(".java"):
                archivo_path = os.path.join(root, archivo)
                with open(archivo_path, 'r', encoding='utf-8') as f:
                    contenido = f.read()
                    # Buscar todas las clases dentro del archivo
                    clases = patron_clase.findall(contenido)
                    clases_encontradas.extend(clases)
    
    return clases_encontradas

# Función para guardar las clases encontradas en un archivo de texto
def guardar_clases_en_archivo(clases, archivo_salida):
    with open(archivo_salida, 'w', encoding='utf-8') as f:
        for clase in clases:
            f.write(clase + "\n")
    print(f"Las clases han sido guardadas en '{archivo_salida}'.")

# Directorio donde se encuentran los archivos .java
directorio_java = './src/'

# Nombre del archivo donde se guardarán los nombres de las clases
archivo_salida = 'nombres_de_clases.txt'

# Buscar las clases en los archivos Java
clases = buscar_clases_java(directorio_java)

# Guardar las clases en el archivo de salida
guardar_clases_en_archivo(clases, archivo_salida)