
# Banque API


## API Reference

#### Get Compte

```http
  GET /api/compte/rib/{rib}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `rib` | `string` | **Required**. |

#### Create Compte

```http
  POST /api/compte
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `compte`      | `Compte` | **Required**. |

#### Get All Comptes

```http
  GET /api/compte
```

#### Create Operation

```http
  POST /api/opperation
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `opperation`      | `Operation` | **Required**. |

#### Cancel Operation

```http
  POST /api/opperation/cancel/code/{code}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `code`      | `String` | **Required**. |

#### Delete Operation

```http
  DELETE /api/opperation/code/{code}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `code`      | `String` | **Required**. |

#### Get All Operations by Compte's Rib

```http
  POST /api/opperation/rib/{rib}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `rib`      | `String` | **Required**. |


#### Delete Operation

```http
  DELETE /api/opperation/code/{code}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `code`      | `String` | **Required**. |

#### Get All Operations

```http
  POST /api/opperation
```

