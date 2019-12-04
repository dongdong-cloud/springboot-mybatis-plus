package fun.imcoder.cloud.enums;

public enum ResponseEnum {
    SUCCESS(200,"成功"),
    UNAUTHORIZED(401,"访问此资源需要完全的身份验证"),
    ACCESS_TOKEN_INVALID(4011,"access_token无效"),
    REFRESH_TOKEN_INVALID(4012,"refresh_token无效"),
    AUTH_ERROR(4013,"用户名或密码错误"),
    INSUFFICIENT_PERMISSIONS(403,"该用户权限不足以访问该资源接口"),
    INCORRECT_PARAMS(412, "参数不正确"),
    SERVER_ERROR(500, "服务器错误"),
    ;
    private Integer code;
    private String message;

    ResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
