package dto.resp;

import enums.OpStatus;
import enums.OpType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response {
    private UUID id;
    private OpStatus operation_status;
    private OpType type;
}

