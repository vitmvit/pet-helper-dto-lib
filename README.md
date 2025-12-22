# pet-helper-dto-lib

[Точка входа в приложение](https://github.com/vitmvit/pet-helper-api-gateway-service)

Содержит необходимые сущности DTO для проекта.

### v2.3 22.12.2025

Удален тип чата MEDICAL
Наложение валидации на модели MessageCreateDto и ChatCreateDto.

### v2.2 21.12.2025

Удалена роль VET из RoleName.
Добавлены исключения - EntityNotFoundException и InvalidJwtException.
Наложение валидации на модели JwtDto, SignInDto и SignUpCreateDto.

### v2.1 21.12.2025

Добавлена модель ErrorDto.
Наложение валидации на модели UserCreateDto и PasswordUpdateDto.
