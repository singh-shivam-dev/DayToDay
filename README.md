# DayToDay
This repo contains implementation for rest api created for rating app.

1)Read/Retrieve
  Request all Products details

Request
HTTP GET -> http://localhost:8080/products 

Response
[
    {
        "productId": 1,
        "productName": "X-ray",
        "productDescription": "Clear films digital Xrays",
        "productImage": "xray.png",
        "comment": [
            {
                "commentId": 1,
                "commentName": "Useful Product",
                "postedBy": "David dhawan",
                "rating": 3
            },
            {
                "commentId": 2,
                "commentName": "Bad experience",
                "postedBy": "Ashish Nehra",
                "rating": 1
            },
            {
                "commentId": 4,
                "commentName": "Awesome Experience",
                "postedBy": "Akshatha babi",
                "rating": 5
            }
        ],
        "ratingData": {
            "averageRating": 3.0,
            "ratingZeroCount": 0,
            "ratingOneCount": 1,
            "ratingTwoCount": 0,
            "ratingThreeCount": 1,
            "ratingFourCount": 0,
            "ratingFiveCount": 1
        }
    },
    {
        "productId": 2,
        "productName": "BloodTest",
        "productDescription": "BloodTest at door service",
        "productImage": "Bloodsample.png",
        "comment": [
            {
                "commentId": 3,
                "commentName": "friendly staff",
                "postedBy": "virat kohli",
                "rating": 4
            },
            {
                "commentId": 5,
                "commentName": "satisfactory product",
                "postedBy": "Ishant singh",
                "rating": 3
            }
        ],
        "ratingData": {
            "averageRating": 3.50,
            "ratingZeroCount": 0,
            "ratingOneCount": 0,
            "ratingTwoCount": 0,
            "ratingThreeCount": 1,
            "ratingFourCount": 1,
            "ratingFiveCount": 0
        }
    }
]


2)Create
  Request to submit a new comment and rating

Request
HTTP POST -> http://localhost:8080/products/2

Request body
{
    "commentName" : "efficient price",
    "postedBy" : "Akash mandal",
    "rating" : "3"
}

Response
{
    "productId": 2,
    "productName": "bandAid",
    "productDescription": "apply at wounded area",
    "productImage": "jpg2.png",
    "comment": [
        {
            "commentId": 3,
            "commentName": "friendly staff",
            "postedBy": "virat kohli",
            "rating": 4
        },
        {
            "commentId": 5,
            "commentName": "satisfactory product",
            "postedBy": "Ishant singh",
            "rating": 3
        },
        {
            "commentId": 14,
            "commentName": "efficient price",
            "postedBy": "Akash mandal",
            "rating": 3
        }
    ],
    "ratingData": {
        "averageRating": 3.33,
        "ratingZeroCount": 0,
        "ratingOneCount": 0,
        "ratingTwoCount": 0,
        "ratingThreeCount": 2,
        "ratingFourCount": 1,
        "ratingFiveCount": 0
    }
}

