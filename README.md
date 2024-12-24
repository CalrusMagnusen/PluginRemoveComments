# Плагин: Удаление однострочных комментариев

## Описание

Этот плагин предназначен для автоматического удаления однострочных комментариев из кода для любых IDE от JetBrains. Он упрощает процесс очистки кода от ненужных комментариев, повышая его читаемость и упрощая рефакторинг.

## Возможности

- Автоматическое удаление однострочных комментариев (начинающихся с `//`).
- Возможность включения/отключения через настройки IDE.

## Установка

1. Скачайте файл SuperPlugin-1.0-SNAPSHOT.zip
2. В вашей IDE перейдите в раздел **Settings** > **Plugins**.
3. Нажмите **Install Plugin from Disk** и выберите скачанный файл.
4. Перезапустите IDE.

## Использование

После установки плагина:

1. Откройте файл с кодом в вашей IDE.
2. Нажмите **Tools** > **Remove Single-Line Comments** или используйте сочетание клавиш **shift + command + P**.
3. Однострочные комментарии будут автоматически удалены из кода.

## Разработка

Плагин написан на языке Java с использованием IntelliJ Platform SDK.

### Основные файлы проекта

- `src/` — исходный код плагина.
- `resources/` — ресурсы (иконки, описания, метаданные).
- `plugin.xml` — описание плагина для IDE.

## Автор

- **ФИО**: Novikov Iaroslav
- **Группа**: M3106

---

