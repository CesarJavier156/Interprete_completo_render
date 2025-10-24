#!/usr/bin/env bash
# build.sh

# Instala dependencias
pip install -r requirements.txt

# Ejecuta migraciones y recopila archivos estáticos
python manage.py migrate
python manage.py collectstatic --noinput
