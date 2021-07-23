package com.e.amicummobile.modelAmicum

import android.util.Log
import com.e.amicummobile.config.Bootstrap
import com.e.amicummobile.config.Const
import com.e.amicummobile.controller.Assistant.fromJson
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject

/**
 * Репозиторий системы, содержит три способа получения данных:
 *  - с удаленного сервера
 *  - с локального сервера
 *  - с локальной БД мобильного приложения
 *  - с тестовых данных
 */
class RepositoryImpl : IRepository {

    init {

    }

    override fun getDataFromRemoteServer(configToRequest: ConfigToRequest): String {
        return ""
    }

    override fun getDataFromLocalServer(configToRequest: ConfigToRequest): String {
        return ""
    }

    override fun getDataFromLocalStorage(configToRequest: ConfigToRequest): String =
        when (configToRequest.method) {
            "actionLogin" -> {

                "{\"Items\":{\"sessionLogin\":\"root\",\"sessionPassword\":\"\",\"userWorkstation\":\"Администратор\",\"employee_id\":1,\"userName\":\"Не заполнено. Н. Н.\",\"last_name\":\"Не заполнено\",\"first_name\":\"Не заполнено\",\"patronymic\":\"Не заполнено\",\"gender\":\"М\",\"birthdate\":\"1970-01-01\",\"position_id\":1,\"position_title\":\"Прочее\",\"position_qualification\":null,\"worker_date_start\":\"2019-10-09\",\"worker_date_end\":\"2099-12-31\",\"userShift\":\"\",\"userCompany\":\"Прочее\",\"userCompanyId\":101,\"userMineId\":290,\"userMineTitle\":\"Заполярная-2\",\"mineCompanyId\":501,\"userDepartmentId\":1,\"userDepartmentTitle\":\"Прочее\",\"userDepartmentPath\":\"Прочее / \",\"userDepartmentTypeId\":2,\"userCompanyDepartmentId\":101,\"userWorkCompanyDepartmentId\":101,\"worker_id\":1,\"user_id\":1,\"workerObject_ids\":[100000009,1],\"userStaffNumber\":\"1\",\"tabel_number\":\"1\",\"session_id\":\"7ko4mjhhg4im3t06fsj75k930q\",\"worker_role\":{\"9\":\"Прочее\",\"172\":\"Гл. геолог\"},\"socket_key\":\"F60ElN8VMFF4047UlYub\"},\"status\":1,\"errors\":[],\"warnings\":[],\"debug\":[],\"debug_data\":[]}"

            }
            "GetNotificationAll" -> {
                "{\"Items\":[{\"id\":\"siz\",\"title\":\"Необходима замена СИЗ\",\"notifications\":[{\"worker_id\":17,\"worker_full_name\":\"Прунька Иван Иванович\",\"worker_staff_number\":\"15-таб\",\"worker_position_title\":\"Главный инженер\",\"checkup_date_start\":\"2021-07-14\",\"checkup_date_end\":\"2021-07-21\",\"flag\":\"true\",\"status_id\":1,\"siz_id\":12,\"siz_title\":\"Тапки\",\"ppk_id\":-1,\"ppk_date_time\":\"\",\"ppk_status_id\":-1,\"checking_id\":-1,\"injunction_id\":-1,\"audit_id\":-1,\"audit_place_id\":-1,\"audit_place_title\":\"\",\"audit_date_time\":\"\",\"check_knowledge_date_time\":\"\",\"briefing_date_time\":\"\"},{\"worker_id\":18,\"worker_full_name\":\"Сизов Иван Иванович\",\"worker_staff_number\":\"16-таб\",\"worker_position_title\":\"Главный механик\",\"checkup_date_start\":\"2021-07-13\",\"checkup_date_end\":\"2021-07-20\",\"flag\":\"false\",\"status_id\":19,\"siz_id\":13,\"siz_title\":\"Сапоги\",\"ppk_id\":-1,\"ppk_date_time\":\"\",\"ppk_status_id\":-1,\"checking_id\":-1,\"injunction_id\":-1,\"audit_id\":-1,\"audit_place_id\":-1,\"audit_place_title\":\"\",\"audit_date_time\":\"\",\"check_knowledge_date_time\":\"\",\"briefing_date_time\":\"\"}]},{\"id\":\"medicalExam\",\"title\":\"Запланированный медицинский осмотр\",\"notifications\":[{\"worker_id\":15,\"worker_full_name\":\"Пупкин Иван Иванович\",\"worker_staff_number\":\"15-таб\",\"worker_position_title\":\"Главный инженер\",\"checkup_date_start\":\"2021-07-14\",\"checkup_date_end\":\"2021-07-21\",\"flag\":\"true\",\"status_id\":1,\"siz_id\":-1,\"siz_title\":\"\",\"ppk_id\":-1,\"ppk_date_time\":\"\",\"ppk_status_id\":-1,\"checking_id\":-1,\"injunction_id\":-1,\"audit_id\":-1,\"audit_place_id\":-1,\"audit_place_title\":\"\",\"audit_date_time\":\"\",\"check_knowledge_date_time\":\"\",\"briefing_date_time\":\"\"},{\"worker_id\":16,\"worker_full_name\":\"Иванов Иван Иванович\",\"worker_staff_number\":\"16-таб\",\"worker_position_title\":\"Главный механик\",\"checkup_date_start\":\"2021-07-13\",\"checkup_date_end\":\"2021-07-20\",\"flag\":\"false\",\"status_id\":19,\"siz_id\":-1,\"siz_title\":\"\",\"ppk_id\":-1,\"ppk_date_time\":\"\",\"ppk_status_id\":-1,\"checking_id\":-1,\"injunction_id\":-1,\"audit_id\":-1,\"audit_place_id\":-1,\"audit_place_title\":\"\",\"audit_date_time\":\"\",\"check_knowledge_date_time\":\"\",\"briefing_date_time\":\"\"}]},{\"id\":\"ppkPab\",\"title\":\"Выдан ПАБ\",\"notifications\":[{\"worker_id\":15,\"worker_full_name\":\"Пупкин Иван Иванович\",\"worker_staff_number\":\"15-таб\",\"worker_position_title\":\"Главный инженер\",\"checkup_date_start\":\"2021-07-14\",\"checkup_date_end\":\"2021-07-21\",\"flag\":\"\",\"status_id\":1,\"siz_id\":-1,\"siz_title\":\"\",\"ppk_id\":15,\"ppk_date_time\":\"2021-11-19\",\"ppk_status_id\":57,\"checking_id\":25,\"injunction_id\":36,\"audit_id\":-1,\"audit_place_id\":-1,\"audit_place_title\":\"\",\"audit_date_time\":\"\",\"check_knowledge_date_time\":\"\",\"briefing_date_time\":\"\"}]},{\"id\":\"audit\",\"title\":\"Запланирован аудит\",\"notifications\":[{\"worker_id\":-1,\"worker_full_name\":\"\",\"worker_staff_number\":\"\",\"worker_position_title\":\"\",\"checkup_date_start\":\"\",\"checkup_date_end\":\"1\",\"flag\":\"\",\"status_id\":1,\"siz_id\":-1,\"siz_title\":\"\",\"ppk_id\":-1,\"ppk_date_time\":\"\",\"ppk_status_id\":-1,\"checking_id\":-1,\"injunction_id\":-1,\"audit_id\":96,\"audit_place_id\":122,\"audit_place_title\":\"Конвейерный штрек 565 Пласта семирного\",\"audit_date_time\":\"2021-07-21\",\"check_knowledge_date_time\":\"\",\"briefing_date_time\":\"\"}]},{\"id\":\"check_knowledge\",\"title\":\"Запланирована проверка знаний\",\"notifications\":[{\"worker_id\":15,\"worker_full_name\":\"Пупкин Иван Иванович\",\"worker_staff_number\":\"15-таб\",\"worker_position_title\":\"Главный инженер\",\"checkup_date_start\":\"\",\"checkup_date_end\":\"1\",\"flag\":\"\",\"status_id\":1,\"siz_id\":-1,\"siz_title\":\"\",\"ppk_id\":-1,\"ppk_date_time\":\"\",\"ppk_status_id\":-1,\"checking_id\":-1,\"injunction_id\":-1,\"audit_id\":-1,\"audit_place_id\":-1,\"audit_place_title\":\"\",\"audit_date_time\":\"\",\"check_knowledge_date_time\":\"2021-07-21\",\"briefing_date_time\":\"\"}]},{\"id\":\"briefing\",\"title\":\"Необходимо пройти инструктаж\",\"notifications\":[{\"worker_id\":15,\"worker_full_name\":\"Пупкин Иван Иванович\",\"worker_staff_number\":\"15-таб\",\"worker_position_title\":\"Главный инженер\",\"checkup_date_start\":\"\",\"checkup_date_end\":\"1\",\"flag\":\"\",\"status_id\":1,\"siz_id\":-1,\"siz_title\":\"\",\"ppk_id\":-1,\"ppk_date_time\":\"\",\"ppk_status_id\":-1,\"checking_id\":-1,\"injunction_id\":-1,\"audit_id\":-1,\"audit_place_id\":-1,\"audit_place_title\":\"\",\"audit_date_time\":\"\",\"check_knowledge_date_time\":\"\",\"briefing_date_time\":\"2021-07-21\"}]},{\"id\":\"ppkInjunction\",\"title\":\"Выдано предписание\",\"notifications\":[{\"worker_id\":-1,\"worker_full_name\":\"\",\"worker_staff_number\":\"\",\"worker_position_title\":\"\",\"checkup_date_start\":\"\",\"checkup_date_end\":\"\",\"flag\":\"\",\"status_id\":1,\"siz_id\":-1,\"siz_title\":\"\",\"ppk_id\":12145,\"ppk_date_time\":\"2021-12-19\",\"ppk_status_id\":57,\"checking_id\":25,\"injunction_id\":36,\"audit_id\":-1,\"audit_place_id\":-1,\"audit_place_title\":\"\",\"audit_date_time\":\"\",\"check_knowledge_date_time\":\"\",\"briefing_date_time\":\"\"}]}],\"errors\":[],\"status\":1,\"warnings\":[]}"
            }
            else -> ""
        }


    override fun getDataTest(configToRequest: ConfigToRequest): String {
        return ""
    }

    override fun getData(configToRequest: ConfigToRequest): String =

        when (Bootstrap.DEFAULT_REQUEST_METHOD) {
            Const.LOCAL_REQUEST_METHOD -> getDataFromLocalStorage(configToRequest)
            Const.SERVER_LOCAL_REQUEST_METHOD -> getDataFromLocalServer(configToRequest)
            Const.SERVER_REMOTE_REQUEST_METHOD -> getDataFromRemoteServer(configToRequest)
            else -> getDataTest(configToRequest)
        }

}
