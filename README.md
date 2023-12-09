
# Virtual Zoo Management System

This is a team project for the school's OOP course. The goal is to create a management system for a zoo with a web-based interface.


## Demo

Insert gif or link to demo


## Features

- Spring Boot Web Api

## API Reference Animal

#### Get all animal

```http
  GET /animal
```

#### Get animal by enclosure id

```http
  GET /animal/enclosure/{id}
```

| Parameter | Type     | Description                        |
| :-------- | :------- | :--------------------------------  |
| `id`      | `int`    | **Required**. Id of enclosure      |

#### Post add animal

```http
  POST /animal/add
```

| Parameter         | Type      | Description                       |
| :--------         | :-------  | :-------------------------------- |
| `id_animal_type`  | `int`     | **Required**. Id of animal type   |
| `id_zoo`          | `int`     | **Required**. Id of zoo           |
| `idEnclosure`     | `int`     | **Required**. Id of enclosure     |
| `id_status`       | `int`     | **Required**. Id of status        |
| `name`            | `string`  | **Required**. animal name         |
| `introduction`    | `string`  | **Required**. animal introduction |
| `nofication`      | `string`  | **Required**. animal nofication   |
| `img_url`         | `string`  | url of animal img                 |

#### Put update animal

```http
  PUT /animal/update
```

| Parameter         | Type      | Description                       |
| :--------         | :-------  | :-------------------------------- |
| `id_animal`       | `int`     | **Required**. Id of animal to edit|
| `id_animal_type`  | `int`     | **Required**. Id of animal type   |
| `id_zoo`          | `int`     | **Required**. Id of zoo           |
| `idEnclosure`     | `int`     | **Required**. Id of enclosure     |
| `id_status`       | `int`     | **Required**. Id of status        |
| `name`            | `string`  | **Required**. animal name         |
| `introduction`    | `string`  | **Required**. animal introduction |
| `nofication`      | `string`  | **Required**. animal nofication   |
| `img_url`         | `string`  | url of animal img                 |

#### Delete animal by id

```http
  DELETE /animal/delete/{id}
```

| Parameter | Type     | Description                          |
| :-------- | :------- | :--------------------------------    |
| `id`      | `int`    | **Required**. Id of animal to delete |

## API Reference Enclosure

#### Get all enclosure

```http
  GET /enclosure
```

#### Post add enclosure

```http
  POST /enclosure/add
```

| Parameter         | Type      | Description                           |
| :--------         | :-------  | :--------------------------------     |
| `id_zoo`          | `int`     | **Required**. Id of zoo               |
| `name`            | `string`  | **Required**. enclosure name          |
| `introduction`    | `string`  | **Required**. enclosure introduction  |

#### Put update enclosure

```http
  PUT /enclosure/update
```

| Parameter         | Type      | Description                           |
| :--------         | :-------  | :--------------------------------     |
| `id_enclosure`    | `int`     | **Required**. Id of enclosure to edit |
| `id_zoo`          | `int`     | **Required**. Id of zoo               |
| `name`            | `string`  | **Required**. enclosure name          |
| `introduction`    | `string`  | **Required**. enclosure introduction  |

#### Delete enclosure by id

```http
  DELETE /enclosure/delete/{id}
```

| Parameter | Type     | Description                              |
| :-------- | :------- | :--------------------------------        |
| `id`      | `int`    | **Required**. Id of enclosure to delete  |

## API Reference Staff

#### Get all staff

```http
  GET /staff
```

#### Post add staff

```http
  POST /staff/add
```

| Parameter         | Type      | Description                       |
| :--------         | :-------  | :-------------------------------- |
| `id_staff_type`   | `int`     | **Required**. Id of staff type    |
| `id_zoo`          | `int`     | **Required**. Id of zoo           |
| `name`            | `string`  | **Required**. staff name          |
| `salary`          | `string`  | **Required**. amount of salary    |

#### Put update staff

```http
  PUT /staff/update
```

| Parameter         | Type      | Description                           |
| :--------         | :-------  | :--------------------------------     |
| `id_staff`        | `int`     | **Required**. Id of staff to edit     |
| `id_staff_type`   | `int`     | **Required**. Id of staff type        |
| `id_zoo`          | `int`     | **Required**. Id of zoo               |
| `name`            | `string`  | **Required**. staff name              |
| `salary`          | `string`  | **Required**. amount of salary        |

#### Delete staff by id

```http
  DELETE /staff/delete/{id}
```

| Parameter | Type     | Description                              |
| :-------- | :------- | :--------------------------------        |
| `id`      | `int`    | **Required**. Id of staff to delete      |

## API Reference FeedLog

#### Get feedLog by animal id

```http
  GET /feedLog/animal/{id}
```

| Parameter | Type     | Description                        |
| :-------- | :------- | :--------------------------------  |
| `id`      | `int`    | **Required**. Id of animal         |

#### Post add feedLog

```http
  POST /feedLog/add
```

| Parameter         | Type      | Description                       |
| :--------         | :-------  | :-------------------------------- |
| `id_food`         | `int`     | **Required**. Id of food          |
| `idAnimal`        | `int`     | **Required**. Id of animal        |
| `time`            | `string`  | **Required**. Timestamp           |


## Deployment

Clone the project

```bash
  git clone https://github.com/Docat0209/zoo-management
```


