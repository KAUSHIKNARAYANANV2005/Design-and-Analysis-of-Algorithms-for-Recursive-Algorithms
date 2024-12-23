FROM python:3.12.4-slim
WORKDIR /app
COPY first.py /app/
CMD ["python", "first.py"]