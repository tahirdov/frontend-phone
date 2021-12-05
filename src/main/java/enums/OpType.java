package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum OpType {
    OPERATION_ADD("add"),
    OPERATION_EDIT("edit"),
    OPERATION_DELETE("delete");

    private final String operation;
}
