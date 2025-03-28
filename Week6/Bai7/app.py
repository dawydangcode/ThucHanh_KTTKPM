from flask import Flask
import os

app = Flask(__name__)

@app.route('/')
def hello():
    env = os.getenv('APP_ENV', 'unknown')
    return f'Hello, Docker! Environment: {env}'

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)