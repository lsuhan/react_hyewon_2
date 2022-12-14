import axios from "axios";


export default class MenuService {
    static getMenus() {
        return axios.get("/api/menu/getMenus");
    }
}

