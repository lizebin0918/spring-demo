package com.lzb.school.config.mybatis.handler;

/**
 * 只是为了适配带时区的Timestamp转LocalDateTime报错的问题，
 * 但是带时区的Timestamp对应的类型应该是OffsetDateTime，如果字段类型声明OffsetDateTime，不会进来
 */
/*
@MappedJdbcTypes({JdbcType.TIMESTAMP, JdbcType.TIMESTAMP_WITH_TIMEZONE})
public class MyOffsetDateTimeTypeHandler extends BaseTypeHandler<LocalDateTime> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, LocalDateTime parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setObject(i, parameter);
    }

    @Override
    public LocalDateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return parse(rs.getObject(columnName, OffsetDateTime.class));
    }

    @Override
    public LocalDateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return parse(rs.getObject(columnIndex, OffsetDateTime.class));
    }

    @Override
    public LocalDateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return parse(cs.getObject(columnIndex, OffsetDateTime.class));
    }

    private LocalDateTime parse(Object value) {
        if (Objects.isNull(value)) {
            return null;
        }
        if (value instanceof OffsetDateTime) {
            return ((OffsetDateTime) value).toLocalDateTime();
        }
        return null;
    }
}*/
