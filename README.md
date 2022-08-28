# Hello World API

## GET API

1. @GetMapping 애노테이션을 사용하는 방식
2. @RequestMapping 애노테이션을 사용하는 방식
3. @PathVariable 애노테이션을 사용하는 방식
4. Map을 사용하는 방식
5. @RequestParam 애노테이션을 사용하는 방식
6. Request DTO를 사용하는 방식

## POST API

1. @PostMapping 애노테이션을 사용하는 방식
2. @RequestBody 애노테이션과 Request DTO를 사용하는 방식
3. @JsonProperty 애노테이션을 통해 client의 전달 key를 DTO의 변수명으로 매핑시킬 수 있다.

## PUT API

1. @PutMapping 애노테이션을 사용하는 방식
2. @RequestBody 애노테이션과 Request DTO를 사용하는 방식
3. @PathVariable 애노테이션을 사용하는 방식
4. @JsonNaming 애노테이션을 사용하여 클래스 전체의 룰을 설정하는 방식
5. @JsonProperty 애노테이션을 사용하여 특정 변수를 매핑하는 방식

## DELETE API

1. @DeleteMapping 애노테이션을 사용하는 방식
2. @PathVariable, @RequestParam 애노테이션을 사용하는 방식

## Response 구성

1. Text Response
2. Json Response
3. ResponseEntity를 사용하여 HttpStatus 지정하는 방식
4. @Controller 애노테이션을 사용하여 페이지 리소스를 사용하는 방식
5. @Controller 애노테이션 하에서 Json Response를 내려주고 싶은 경우 @ResponseBody 애노테이션을 사용하는 방식
6. @JsonInclude 애노테이션을 사용하여 포함시킬 값의 룰을 지정하는 방식
