package ladder.domain;

import common.utils.StringUtils;

import java.util.Objects;

public class Participant {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public Participant(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("참가자 이름을 입력해 주세요.");
        }
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("참가자 이름은 최대 5글자까지 입력할 수 있습니다.");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}