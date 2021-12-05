package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum OpStatus {
    FAIL("fail"),
    SUCCESS("success");

    private final String status;
}
