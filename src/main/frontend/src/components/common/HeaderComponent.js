import {Component} from "react";
import MenuService from "../../service/MenuService";

class HeaderComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            menus: []
        }

    }
    componentDidMount() {
        MenuService.getMenus().then((res) =>{
            this.setState({ menus : res.data});
        });
    }
    render() {
        return (
            <nav className="navbar navbar-default">
                <div className="container-fluid">
                    <div className="navbar-header">
                        <a className="navbar-brand" href="#">WebSiteName</a>
                    </div>
                    <ul className="nav navbar-nav">
                        {
                            this.state.menus.map(
                                menu =>
                                    <li key={menu.id}><a href={menu.url}>{menu.name}</a></li>
                            )
                        }
                    </ul>
                </div>
            </nav>
        )
    }

}
export default HeaderComponent;
