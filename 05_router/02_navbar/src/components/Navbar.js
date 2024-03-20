import { Link } from "react-router-dom";

function Navbar() {
    return (
    <div>
        <ul>
           <li><Link to="/">Home</Link></li>
           <li><Link to="/mypage">마이페이지</Link></li>
           <li><Link to="/login">로그인</Link></li>
        </ul>
    </div>
    );
}

export default Navbar;