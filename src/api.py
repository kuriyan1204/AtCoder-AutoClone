import yaml
import requests

CONFIG_PATH = "config/config.yml"
PROBLEMS_API_ENDPOINT = "https://kenkoooo.com/atcoder/atcoder-api/v3/user/submissions"


def load_yml() -> dict:
    with open(CONFIG_PATH, "r") as f:
        config = yaml.safe_load(f)
    return config


def get_submissions(user_id: str, unix_time: int) -> dict:
    """
    Get submission information via AtCoder Problems API

    Parameters
    ==========
    user_id : str
    unix_time : int

    Returns
    =======
    submissions : dict
    """
    params = {"user": user_id, "from_second": unix_time}
    result = requests.get(url=PROBLEMS_API_ENDPOINT, params=params)

    if not result.status_code == 200:
        raise Exception(f"{result.status_code} : Something went wrong")

    return result.json()


if __name__ == "__main__":
    pass
