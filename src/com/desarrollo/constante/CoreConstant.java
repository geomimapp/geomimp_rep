package com.desarrollo.constante;

public class CoreConstant {

	public static final String RESULT_FAILURE = "FAILURE";
    public static final String RESULT_SUCCESS = "SUCCESS";

    public static final String LOGGED_USER = "LOGGED_USER";

    public static final Integer STATUS_ACTIVE = 1;
    public static final Integer STATUS_INACTIVE = 0;

    public static final String DATA_ALL = "TODOS";

    public static final String ACTIVE_YES = "S";
    public static final String ACTIVE_NOT = "N";

    public static final String S = "S";
    public static final String N = "N";

    public static final String ABIERTO = "A";
    public static final String CERRADO = "C";
    public static final String FINALIZADO = "F";

    public static final String WS_NOT_CALLED = "0";
    public static final String WS_PROBLEM = "1";

    public static final String BLANCO = " ";
    public static final String VACIO = "";

    public static final String OPERATION_NEW = "OPERATION_NEW";
    public static final String OPERATION_EDIT = "OPERATION_EDIT";
    public static final String OPERATION_VIEW = "OPERATION_VIEW";
    public static final String OPERATION_DELETE = "OPERATION_DELETE";

    public static final String TIPO_MENSAJE_ALERTA = "TIPO_MENSAJE_ALERTA";
    public static final String TIPO_MENSAJE_ERROR = "TIPO_MENSAJE_ERROR";
    public static final String TIPO_MENSAJE_INFO = "TIPO_MENSAJE_INFO";

    public static final String SITUACION_MENSAJE_EN_ESPERA = "SITUACION_MENSAJE_EN_ESPERA";
    public static final String SITUACION_MENSAJE_ENVIANDO = "SITUACION_MENSAJE_ENVIANDO";
    public static final String SITUACION_MENSAJE_RECIBIDO = "SITUACION_MENSAJE_RECIBIDO";
    public static final String SITUACION_MENSAJE_PROBLEMA = "SITUACION_MENSAJE_PROBLEMA";
    public static final String SITUACION_MENSAJE_NOT_FOUND_MAIL = "SITUACION_MENSAJE_NOT_FOUND_MAIL";

    public static final String FMT_FECHA_DDMMYYYY = "dd/MM/yyyy";

    public static final String CONDITION_OR = "or";
    public static final String CONDITION_AND = "and";
    public static final String SEPARATOR_COMA = ",";
    public static final String SEPARATOR_GUION = "-";
    public static final String SEPARATOR_FOLDER = "/";

    public static final String CODIGO_TODOS = "-1"; // "100";

    public static final String SALTO_MENSAJE = "\n";

    public static final Integer MAX_SIZE_FILE_UPLOAD = 10485760;

    public static final Long LEVEL_ZERO = 0L;

    public static final String URL_FORWARD = "pe.gob.mimp.constant.CoreConstant.URL_FORWARD";

    public static final Long ID_NEGATIVE = -1L;
    public static final Long NUMBER_ZERO = 0L;
    public static final Long CARGO_PADRE_ID = 7L;

    public static final Integer ROL_ESPECIALISTA_SBP = 1;
    public static final Integer ROL_ESPECIALISTA_DIBP = 2;
    public static final Integer ROL_DIRECTOR_SBP = 3;
    public static final Integer ROL_DIRECTOR_DIBP = 4;
    public static final Integer ROL_COORDINADOR_DIBP = 5;
    public static final Integer ROL_ADMINISTRADOR_SISTEMA = 6;

    public static final String URL_LINK_SYSTEM = "URL_LINK_SYSTEM";
    public static final String LINK_PAGE_HOME = "LINK_PAGE_HOME";

    public static final String FOLDER_WORKSPACE_SBP = "RUTA_TRABAJO_SBP";
    public static final String FOLDER_RESOLUCION = "FOLDER_RESOLUCION";
    public static final String FOLDER_CONTRATO = "FOLDER_CONTRATO";

    public static final String MODULO_BENEFICENCIA = "BENEFICENCIA";

    public static final String IS_ASSOCIATE_ENTITY = "IS_ASSOCIATE_ENTITY";
    public static final String IS_ADMINISTRATOR = "IS_ADMINISTRATOR";
    public static final String ENTITY_ASSOCIATE_ID = "ENTITY_ASSOCIATE_ID";
    public static final String AMBITO_ENTITY_ID = "AMBITO_ENTITY_ID";

    public static final String CWS_CONNECT_TIMEOUT = "CWS_CONNECT_TIMEOUT";
    public static final String CWS_REQUEST_TIMEOUT = "CWS_REQUEST_TIMEOUT";

    public static final String LOCATE_ES_PE = "es_PE";
    public static final String LOCATE_ES_ES = "es_ES";
    
    public static final String FORMAT_PDF = "PDF";
    public static final String FORMAT_XLS = "XLS";
    public static final String FORMAT_XLSX = "XLSX";

    public static final String PERSONA_NATURAL = "PERSONA NATURAL";
    public static final String PERSONA_JURIDICA = "PERSONA JURIDICA";

    public static final Integer NUMBER_PARTITION = 100;

    public static final String TEXT_UNO = "1";
    public static final String TEXT_DOS = "2";
    
    public static enum OrderEnums {
        ASCENDING("ASCENDING", "asc"), DESCENDING("DESCENDING", "desc");

        private String code;
        private String abbreviation;

        private OrderEnums(String code, String abbreviation) {
            this.code = code;
            this.abbreviation = abbreviation;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        public void setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
        }

    }

    public static enum CharacterEnums {
        PUNTO("."), COMA(","), GUION("-"), BACKSLASH("/"), SPACE(" "), VACIO(""),
        PIPE("|"), SUBGUION("_");

        private String character;

        private CharacterEnums() {
        }

        private CharacterEnums(String character) {
            this.character = character;
        }

        public String getCharacter() {
            return character;
        }

        public void setCharacter(String character) {
            this.character = character;
        }

    }

    public static enum FileFormatEnums {
        JPG("image/jpeg", "jpg"), PNG("image/png", "png");

        private String format;
        private String extension;

        private FileFormatEnums() {
        }

        private FileFormatEnums(String format, String extension) {
            this.format = format;
            this.extension = extension;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getExtension() {
            return extension;
        }

        public void setExtension(String extension) {
            this.extension = extension;
        }

    }

    public static enum OperadorLogicEnums {
        TRUE(true), FALSE(false);

        private Boolean operador;

        private OperadorLogicEnums() {
        }

        private OperadorLogicEnums(Boolean operador) {
            this.operador = operador;
        }

        public Boolean getOperador() {
            return operador;
        }

        public void setOperador(Boolean operador) {
            this.operador = operador;
        }
    }

    public static enum NumberEnums {
        ZERO(0), ONE(1), TWO(2), THREE(3);

        private Integer number;

        private NumberEnums() {
        }

        private NumberEnums(Integer number) {
            this.number = number;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }
    }

    protected CoreConstant() {
        throw new UnsupportedOperationException();
    }
}
